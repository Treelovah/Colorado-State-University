/**
 *
 * @author Joseph Riva
 * @since 05/19/2020
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Movie {
    //the name of the movie
    private String name;
    //a list of the movies ratings
    private List<Integer> ratings;
    //length of the movie(in minutes)
    private int length;

    /** TODO Finish the constructor
     * The constructor should set the values of the class variables name and length to the parameters
     * name and length which are passed into the constructor
     * The constructor should also initialize the List<Integer> rating
     * @param name
     * @param length
     */
    public Movie(String name, int length){
        //CODE HERE
        this.name = name;
        this.length = length;
        ratings = new ArrayList<Integer>();
    }
    /** TODO Create getters/setters
     * Create getters and setters for ALL fields of this class.
     * Be sure to name them properly. For example, the getter for name
     * would be called getName() and the setter would be called setName()
     *
     * There should be a getter/setter for name, ratings and length
     */

    public void setName(String name){
        this.name = name;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public String getName(){
        return this.name;
    }

    public int getLength()
    {
        return this.length;
    }

    /**TODO Complete this method
     * This method should add a rating to the List of ratings for this movie
     * @param rating - a rating which should be between 0 and 5
     */
    public void addRating(int rating){
        ratings.add(rating);
    }

    /** TODO Complete this method
     * This method should return the average of the ratings in the list of ratings for this movie
     * HINT: remember the difference between integer division and double division
     * @return average movie rating as a double
     */
    public double getAverageRating(){
        double sum = 0.0;
        int i = 0;
        for (; i < ratings.size(); i++)
        {
            sum += ratings.get(i);
        }
        return ( sum / ratings.size() );
    }

    @Override
    /**
     * This method has already been completed
     */
    public String toString() {
        return String.format("Movie Name: %s, Movie Length(in minutes): %d", name, length);
    }

    public static void main(String[] args){
        Movie nemo = new Movie("Finding Nemo", 100);
        System.out.println("Constructor Check: " + nemo);
        Random r = new Random(5192020);
        //adds one hundred random ratings to the list for nemo
        // this would be better as a do while. so i dun fixed it :)
        int i = 0;
        do 
        {
            int rating = r.nextInt(6);
            nemo.addRating(rating);
            i++;
        } while (i < 100);
        System.out.printf("Average Rating: %.2f" , nemo.getAverageRating());
    }
}
