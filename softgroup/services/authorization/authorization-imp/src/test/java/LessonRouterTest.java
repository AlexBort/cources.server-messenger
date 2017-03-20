/*
import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

*/
/**
 * Created by Odin on 01.03.2017.
 *//*


@RunWith(MockitoJUnitRunner.class)
public class LessonRouterTest {

    @InjectMocks
    private LessonRouter lessonRouter;

    @Spy
    private List<Handler> handlers = new ArrayList<>();

    private Handler handlerOne;

    private Handler handlerTwo;

    @Before
    public void init(){
        handlerOne = Mockito.mock(Handler.class);
        handlerTwo = Mockito.mock(Handler.class);

        when(handlerOne.getName()).thenReturn("handler_one");
        when(handlerTwo.getName()).thenReturn("handler_two");

      //  when(handlerTwo.getName()).thenAnswer();

        handlers.add(handlerOne);
        handlers.add(handlerTwo);

        lessonRouter.init();
    }


    @Test
    public void testGetHandler(){
        assertThat(lessonRouter.getHandler(null), nullValue());
        assertThat(lessonRouter.getHandler("test_name"), nullValue());
        assertThat(lessonRouter.getHandler("handler_one"), is(handlerOne));
        assertThat(lessonRouter.getHandler("handler_two"), is(handlerTwo));
    }

    @Test
    public void testRoute(){
        Request<?> request = new Request<>();
        ActionHeader header = new ActionHeader();
        header.setCommand("handler_one");
        request.setHeader(header);

        lessonRouter.route(request);

        verify(handlerOne).handle(request);
        verify(handlerTwo, never()).handle(any());
    }



}
*/
