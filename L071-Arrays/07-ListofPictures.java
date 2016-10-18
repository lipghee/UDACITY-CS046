// BlueJ project: lesson7/gallery3

import java.util.ArrayList;

public class ListOfPictures
{
    public static void main(String[] args)
    {
        ArrayList<Picture> gallery = new ArrayList<Picture>();
        gallery.add(new Picture("degas1.jpg"));
        gallery.add(new Picture("gaugin1.jpg"));
        gallery.add(new Picture("monet1.jpg"));
        gallery.add(new Picture("monet2.jpg"));
        gallery.add(new Picture("renoir1.jpg"));

        int width = 0;
        for (Picture pic : gallery)
        {      
            width = width + 10;
            pic.translate(width,0);
            width = pic.getMaxX();
            pic.draw();
        }
    }
}
