import com.softgroup.authorization.impl.router.AuthorizationRouter;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by User on 18.03.2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class AuthorizationRouterTest {

    @InjectMocks
    private AuthorizationRouter authorizationRouter;

    @Spy
    private List<Handler> handlers = new ArrayList<Handler>();


    @Spy
    private HashMap<String, Handler> handlerMap = new HashMap();

    @Mock
    private Handler handlerOne;
    @Mock
    private Handler handlerTwo;

    Request request = new Request();
    @Before
    public void init() {

        ActionHeader actionHeader = new ActionHeader();
        actionHeader.setCommand("handler_one");

        request.setHeader(actionHeader);


        handlerOne = Mockito.mock(Handler.class);
        handlerTwo = Mockito.mock(Handler.class);

        when(handlerOne.getName()).thenReturn("handler_one");
        when(handlerTwo.getName()).thenReturn("handler_two");

        handlers.add(handlerOne);
        handlers.add(handlerTwo);

        authorizationRouter.init();


    }

    @Test
    public void testGetName() {
        authorizationRouter.handle(request);
        verify(handlerOne).handle(request);}
}


/*   /*{
"header": {
"uuid": "4f4",
"type":"authorization",
"version": "1",
"command": "register"},
"data":{
"phone_number": "0984524722",
"local_code": "lc385259",
"device_id": "id94582502"
}
}
*/