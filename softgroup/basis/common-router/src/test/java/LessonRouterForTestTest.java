import com.softgroup.common.protocol.ActionHeader;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.LessonRouterForTest;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import static org.junit.Assert.assertThat;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.core.IsNull.nullValue;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by User on 03.03.2017.
 */


@RunWith(MockitoJUnitRunner.class)
public class LessonRouterForTestTest {

    @InjectMocks
    private LessonRouterForTest lessonRouterForTest;

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

        handlers.add(handlerOne);
        handlers.add(handlerTwo);

        lessonRouterForTest.init();
    }


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

}

