/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author: Name: Ayush Gupta
 *           Email: ag2049@scarletmail.rutgers.edu
 *           NetID: ag2049 
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
		// WRITE YOUR CODE HERE

		int numOfReviewers = Integer.parseInt(args[0]);
		int numOfMovies = Integer.parseInt(args[1]);
		int argNum = 2; 
		int index = 0; 
		int[][] movieRatings = new int[numOfReviewers][numOfMovies];
		int [] sumOfMovieRatings = new int [numOfMovies];

		//
		for (int i = 0; i<numOfReviewers; i++){
			for (int j = 0; j<numOfMovies; j++){
				movieRatings[i][j] = Integer.parseInt(args[argNum]);
				argNum++; 
			}
		}
	
		for (int col = 0; col < numOfMovies; col++) { 
			for (int row = 0; row < numOfReviewers; row++) { 
				sumOfMovieRatings[col] += movieRatings[row][col];
			}
		}
			int sumOfRatings = sumOfMovieRatings[0]; 
			for (int x = 1; x<sumOfMovieRatings.length; x++){
				if(sumOfMovieRatings[x]>sumOfRatings){
					sumOfRatings = sumOfMovieRatings[x];
					index =x;
					}
				}

			System.out.println(index); 
				
		}

	}

