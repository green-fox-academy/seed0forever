public class BlogPost {

  String authorName;
  String title;
  String text;
  String publicationDate;

  public BlogPost() {
  }

  public BlogPost(String authorName, String publicationDate) {
    this.authorName = authorName;
    this.publicationDate = publicationDate;
  }

  public BlogPost(String authorName, String publicationDate, String title, String text) {
    this.authorName = authorName;
    this.publicationDate = publicationDate;
    this.title = title;
    this.text = text;
  }

  public static void main(String[] args) {
    BlogPost loremIpsum = new BlogPost("John Doe", "2000.05.04.");
    loremIpsum.title = "Lorem Ipsum";
    loremIpsum.text = "Lorem ipsum dolor sit amet.";

    BlogPost post1 = new BlogPost();
    post1.authorName = "Tim Urban";
    post1.publicationDate = "2010.10.10.";
    post1.title = "Wait but why";
    post1.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";

    BlogPost post2 = new BlogPost("William Turton", "2017.03.28.",
            "One Engineer Is Trying to Get IBM to Reckon With Trump",
            "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.");

  }

}
