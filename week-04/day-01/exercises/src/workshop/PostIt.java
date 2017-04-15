package workshop;

public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  public static void main(String[] args) {
    PostIt note1 = new PostIt();
    note1.backgroundColor = "orange";
    note1.textColor = "blue";
    note1.text = "Idea 1";

    PostIt note2 = new PostIt();
    note2.backgroundColor = "pink";
    note2.textColor = "black";
    note2.text = "Awesome";

    PostIt note3 = new PostIt();
    note3.backgroundColor = "yellow";
    note3.textColor = "green";
    note3.text = "Superb!";
  }

}
