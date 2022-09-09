package com.service;


import java.util.ArrayList; import java.util.Collections; import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.*; import com.entity.Test; import com.entity.User;
import com.repository.Quizrepo;
//import com.repository.Resultrepo; import com.repository.Testrepo; import com.repository.Userrepo;
import com.repository.Testrepo;
import com.repository.Userrepo;

@Service
public class UserSer {


List<Result> finalList=new ArrayList<>(); @Autowired
Userrepo ur; @Autowired Quizrepo qr; @Autowired Testrepo tr; @Autowired
// Resultrepo resrepo;
// @Autowired User u; @Autowired Test t;

Result r= new Result(null, 0);

public String userLogin(String email,String password)
{
ur=(Userrepo) ur.findByEmailid(email); if(ur!=null)
{


if(ur.getEmailid().equals(email)&&ur.getPassword(password).equals(password))
{
 

}
else
{

}
 
return "login sucessfull";



return "invalid credentials";
 


 
}
else
{

}
 



return "User not found";
 


}


public String userRegister(User u)
{
if(ur.findByEmailid(u.getEmailid())==null)
{
 


}
else
{

}
}
 
ur.save(u);
return "registered";



return "User already exists";
 

public List<Object> viewAllQuiz()
{
return qr.listOfQuiz();
}

public String takeTest(Test t)
{
if(t!=null)
{
 


}

else
{

}
 
tr.save(t);
return "submitted";




return "submission failed";
 
}

public List<Test> getTestList()
{
return tr.findAll();
}

public List<Result> result()
{
String email=""; int mark=0;
List<Test> obj=tr.findAll(); List<User> u= ur.findAll(); for (User user : u) {
mark=0; email=user.getEmailid();
System.out.println(user.getEmailid());

for(Test ob :obj)
{
if(user.getUid()==ob.getUserid().getUid())
{

if(ob.getTestans()==ob.getQuestionid().getAns())
{
mark++;
}
System.out.println("inside"+mark);

}
}
System.out.println("outside"+mark);


finalList.add(new Result(email,mark));



}
System.out.println("final :"+mark); Collections.sort(finalList);
return finalList;

}
}

