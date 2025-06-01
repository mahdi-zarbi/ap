public class Book implements Comparable<Book>{
    String auther;
    String title;
    int years;

    public Book(String auther,String title, int years){
        this.auther=auther;
        this.title=title;
        this.years=years;
    }
    @Override
    public int compareTo(Book o){
        int com=this.auther.compareTo(o.auther);
        if(com==0){
            return Integer.compare(this.years,o.years);
        }
        return com;
    }
    @Override
    public String toString(){
        return "auther: "+auther+"   title: "+title+"    years: "+years;
    }

}
