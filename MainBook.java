import java.util.*;
class Book{
    String publishername;
                String authorname;
                String bookname;
                int isbcnum;
                void setPublishername(String publishername)
                {
                    this.publishername=publishername;
                }
    void setAuthorname(String authorname)
                {
                    this.authorname=authorname;
                }
    void setBookname(String bookname)
                {
                    this.bookname=bookname;
                }
    void setIsbcnum(int isbcnum)
                {
                    this.isbcnum=isbcnum;
                }
    String getPublishername()
    {
       return publishername;
    }
    String getAuthorname()
    {
       return authorname;
    }
    String getBookname()
    {
       return bookname;
    }
    int getIsbcnum()
    {
       return isbcnum;
    }
}             
class McGrawhill extends Book{
}
class Packt extends Book{
}
class MainBook{
     public static void main(String[] args)
                {
                     McGrawhill m=new McGrawhill();
                                Packt p=new Packt();
                                m.setPublishername("Sri");
                                m.setAuthorname("Birds");
                                m.setBookname("Nature");
                                m.setIsbcnum(2436);
                                System.out.println("Publisher name : "+m.getPublishername());
                                System.out.println("Author name : "+m.getAuthorname());
                                System.out.println("Book name : "+m.getBookname());
                                System.out.println("Isbc number : "+m.getIsbcnum());
                                p.setPublishername("Vijay");
                                p.setAuthorname("Kumar");
                                p.setBookname("Beauty of Life");
                                p.setIsbcnum(4236);
                                System.out.println("Publisher name : "+p.getPublishername());
                                System.out.println("Author name : "+p.getAuthorname());
                                System.out.println("Book name : "+p.getBookname());
								System.out.println("ISBC Number : "+p.getIsbcnum());
				}
}