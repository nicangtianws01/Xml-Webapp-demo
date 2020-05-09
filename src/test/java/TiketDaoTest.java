import com.ws.demo.dao.TicketDao;
import com.ws.demo.entity.Ticket;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TiketDaoTest {
    @Autowired
    TicketDao ticketDao;
    @Test
    public void testGetTicket(){
        List<Ticket> list = ticketDao.getTicketList("");
        for (Ticket ticket:list){
            log.info(ticket.toString());
        }
    }
}
