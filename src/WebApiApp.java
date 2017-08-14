import entities.*;
import logic.dao.JobDAO;
import logic.dao.JobApplicationDAO;
import logic.dao.UserDAO;
import logic.dao.PostDAO;
import logic.invoicing.InvoicingUtil;

import java.util.List;

public class WebApiApp {

    public static void main(String[] args) {

//        this part can run, when our API service is online
//
        JobApplicationDAO jobApplicationDAO = new JobApplicationDAO();
        JobDAO jobDAO = new JobDAO();
        UserDAO userDAO = new UserDAO();
        List<JobApplication> jobApplications = jobApplicationDAO.getCompleted();

        InvoicingUtil invoicingUtil = new InvoicingUtil();

        jobApplications.forEach(jobApplication -> {
            Job job = jobDAO.get(jobApplication.getJobId());
            User user = userDAO.get(job.getUserID());

            String userName = user.getName();
            double amount = job.getPrice();
            Invoice invoice = new Invoice(userName, amount);

            invoicingUtil.doInvoice(invoice);
        });


        // this part is a demonstration to show the client works, using an online REST API

        PostDAO postDAO = new PostDAO();
        Post post = postDAO.get(1);
        System.out.println(post + "\n");

        List<Post> posts = postDAO.getAllForUser(3);
        for (Post post1 : posts) {
            System.out.println(post1 + "\n");
        }
    }
}
