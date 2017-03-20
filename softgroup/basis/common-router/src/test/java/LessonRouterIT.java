import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.LessonRouterForTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertThat;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;


/**
 * Created by User on 03.03.2017.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {LessonRouterIT.LessonRouterTestCfg.class})
public class LessonRouterIT {

    @Autowired
    private LessonRouterForTest lessonRouterForTest;

    @Autowired
    @Qualifier("handlerOne")
    private Handler handlerOne;

    @Autowired
    @Qualifier("handlerTwo")
    private Handler handlerTwo;

    @Test
    public void testGetHandler(){
        assertThat(lessonRouterForTest.getHandler(null), nullValue());
        assertThat(lessonRouterForTest.getHandler("test_name"), nullValue());
        assertThat(lessonRouterForTest.getHandler("handler_one"), is(handlerOne));
        assertThat(lessonRouterForTest.getHandler("handler_two"), is(handlerTwo));
    }

    @Test
    public void testRoute(){
        Request<?> request = new Request<>();
        ActionHeader header = new ActionHeader();
        header.setCommand("handler_one");
        request.setHeader(header);

        lessonRouterForTest.route(request);

        verify(handlerOne).handle(request);
        verify(handlerTwo, never()).handle(any());
    }


    @Configuration
    public static class LessonRouterTestCfg {

        @Bean
        public LessonRouterForTest lessonRouter(){
            return new LessonRouterForTest();
        }

        @Bean(name = "handlerOne")
        public Handler handler(){
            Handler handler = Mockito.mock(Handler.class);
            when(handler.getName())
                    .thenReturn("handler_one");
            return handler;
        }

        @Bean(name = "handlerTwo")
        public Handler handler2(){
            Handler handler = Mockito.mock(Handler.class);
            when(handler.getName())
                    .thenReturn("handler_two");
            return handler;
        }

    }
}
