package com.driver;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestParam;
import java.util.Date;
import java.util.List;

@Service
public class WhatsappService
{
    WhatsappRepository whatsappRepository = new WhatsappRepository();

    // 1)
    public String createUser(String name, String mobile) throws Exception {
           return whatsappRepository.createUser(name, mobile);

    }

    // 2)
    public Group createGroup(List<User> users)
    {
        return whatsappRepository.createGroup(users);
    }

    // 3)
    public int createMessage(String content)
    {
        return whatsappRepository.createMessage(content);
    }

    // 4)
    public int sendMessage(Message message, User sender, Group group) throws Exception {

           return whatsappRepository.sendMessage(message, sender, group);

    }

    // 5)
    public String changeAdmin(User approver, User user, Group group) throws Exception
    {

             return whatsappRepository.changeAdmin(approver, user, group);

    }


}
