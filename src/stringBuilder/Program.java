package stringBuilder;

import stringBuilder.entities.Comment;
import stringBuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow, that's awesome");

        Comment cc1 = new Comment("Good night");
        Comment cc2 = new Comment("May the Force be with you");


        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);

        p1.addComment(c1);
        p1.addComment(c2);

        System.out.println(p1);

        System.out.println();

        Post p2 = new Post(
                sdf.parse("280/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        p2.addComment(cc1);
        p2.addComment(cc2);

        System.out.println(p2);

        Date data = new Date();

        System.out.println(data);
    }
}
