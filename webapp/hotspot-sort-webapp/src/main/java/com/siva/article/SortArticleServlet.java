package com.siva.article;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by siva on 2017/1/18.
 */
@WebServlet(name = "ArticleSort",urlPatterns = "article")
public class SortArticleServlet extends HttpServlet {
    static private String FLAG_GETALL = "1";

    SortArticleService sortArticleService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String flag = req.getParameter("flag");

        if("1".endsWith(flag)){
            List<SortArticle> allArticl;
            System.err.println("11111");
        }
    }
}
