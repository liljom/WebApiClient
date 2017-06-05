import entities.*;
import logic.dao.JobDAO;
import logic.dao.JobDealDAO;
import logic.dao.UserDAO;
import logic.dao.PostDAO;
import logic.invoicing.InvoicingUtil;

import java.util.List;

/**
 * Created by liljom on 2017. 05. 31..
 */
public class WebApiApp {

    public static void main(String[] args) {

//        JobDealDAO jobDealDAO = new JobDealDAO();
//        JobDAO jobDAO = new JobDAO();
//        UserDAO userDAO = new UserDAO();
//        List<JobDeal> jobDeals = jobDealDAO.getCompleted();
//
//        InvoicingUtil invoicingUtil = new InvoicingUtil();
//
//        jobDeals.forEach(jobDeal -> {
//            Job job = jobDAO.get(jobDeal.getJobId());
//            User user = userDAO.get(job.getUserID());
//
//            Invoice invoice = new Invoice();
//            invoice.setAmount(job.getPrice());
//            invoice.setCustomerName(user.getName());
//
//            invoicingUtil.doInvoice(invoice);
//        });

        PostDAO postDAO = new PostDAO();
        Post post = postDAO.get(1);
        System.out.println(post);
        List<Post> posts = postDAO.getAllForUser(1);
        for (Post post1 : posts) {
            System.out.println(post1 + "\n");
        }
    }
}
