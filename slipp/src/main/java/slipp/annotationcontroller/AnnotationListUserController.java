//package slipp.annotationcontroller;
//
//import nextstep.web.annotation.Controller;
//import nextstep.web.annotation.RequestMapping;
//import nextstep.web.annotation.RequestMethod;
//import slipp.annotationcontroller.UserSessionUtils;
//import slipp.support.db.DataBase;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Controller
//public class AnnotationListUserController {
//    @RequestMapping(value = "/users", method = RequestMethod.GET)
//    public String listUser(HttpServletRequest req, HttpServletResponse resp) throws Exception {
//        if (!UserSessionUtils.isLogined(req.getSession())) {
//            return "redirect:/users/loginForm";
//        }
//
//        req.setAttribute("users", DataBase.findAll());
//        return "/user/list.jsp";
//    }
//}
