package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CityDao dao = new CityDaoJDBC();
        City city = dao.findById(4050);
        System.out.println("city = " + city);
    }
}
