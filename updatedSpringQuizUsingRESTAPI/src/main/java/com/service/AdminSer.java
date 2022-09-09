package com.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.entity.Admin; import com.entity.Question; import com.entity.Quiz; import com.entity.Result; import com.entity.Statistics; import com.entity.User;
import com.repository.AdminRepo; import com.repository.Questionrepo; import com.repository.Quizrepo; import com.repository.Userrepo;

@Service
public class AdminSer { @Autowired Questionrepo qr; @Autowired Quizrepo qur; @Autowired Userrepo ur; @Autowired Statistics stat; @Autowired AdminRepo adr;



public String adminLogin(Admin u)
{
Admin ad= adr.findById(1).get(); if(u.getUsername().equals(ad.getUsername())&&u.getPassword().equals(ad.getPassword()))
{
 

}
else
{

}

 
return "Welcome admin";



return "invalid Credentials";}
 
public String adminupdate(Admin a)
{
 
Admin ad= adr.findById(1).get(); ad.setUsername(a.getUsername()); ad.setPassword(a.getUsername()); adr.saveAndFlush(ad);
return "Updated";


}

public String addQuestion(Question q)
{
if(q!=null)
{
 


}
else
{

}
 
qr.save(q);
return "question added";



return "failed to add";
 

}

public String addQuiz(Quiz q)
{

if(q!=null)
{
 


}
else
{

}
}
 
qur.save();
return "quiz added";



return "failed to add";
 

public List<Quiz> viewAllQuiz()
{
return qur.findAll();
}
public Statistics quizInfo()
{
stat.setUsers(ur.findAll().size()); stat.setQuestions(qr.findAll().size()); stat.setQuiz(qur.listOfQuiz());

return stat;
 
}
}

