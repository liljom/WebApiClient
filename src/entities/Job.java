package entities;

/**
 * Created by liljom on 2017. 05. 31..
 */
public class Job {
    public int JobId;
    public String Title;
    public String Description;
    public String DateStart;
    public String DateEnd;
    public int Hours;
    public double Price;
    public int CategoryId;
    public int UserID;

    public int getJobId() {
        return JobId;
    }

    public void setJobId(int jobId) {
        JobId = jobId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDateStart() {
        return DateStart;
    }

    public void setDateStart(String dateStart) {
        DateStart = dateStart;
    }

    public String getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(String dateEnd) {
        DateEnd = dateEnd;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getUserID() {
        return UserID;
    }
}
