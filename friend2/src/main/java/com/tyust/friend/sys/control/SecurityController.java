//package com.tyust.friend.sys.control;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.security.web.DefaultRedirectStrategy;
//import org.springframework.security.web.RedirectStrategy;
//import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
//import org.springframework.security.web.savedrequest.RequestCache;
//import org.springframework.security.web.savedrequest.SavedRequest;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@RestController
//public class SecurityController {
//    private Logger logger = LoggerFactory.getLogger(getClass());
//
//    //原请求信息的缓存及恢复
//    private RequestCache requestCache = new HttpSessionRequestCache();
//
//    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
//
//    public void requireAuthenication(HttpServletRequest request, HttpServletResponse response)throws IOException {
//        SavedRequest savedRequest = requestCache.getRequest(request,response);
//
//        if(savedRequest!=null){
//            String targetUrl = savedRequest.getRedirectUrl();
//            logger.info("引发跳转的请求是:"+targetUrl);
//            if(StringUtils.endsWithIgnoreCase(targetUrl,".html")){
//                redirectStrategy.sendRedirect(request,response,"/index.html");
//            }
//        }
//    }
//}
