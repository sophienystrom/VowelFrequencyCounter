import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    

 Scanner userInput = new Scanner(System.in);
 System.out.print("Enter a word or phrase: ");
 String inputPhrase = userInput.nextLine();

 VowelCounter(inputPhrase);



  }

  public static void VowelCounter(String wordPhrase){
  
  int aCounter, eCounter, iCounter, oCounter, uCounter;
  
  for (int counter = 0; counter < wordPhrase.length(); counter++){
    char nextChar = wordPhrase.charAt(counter);

    switch (nextChar){
    case 'a':
    aCounter = aCounter + 1;
    continue;
    case 'e':
    eCounter = eCounter + 1;
    continue;
    case 'i':
    iCounter = iCounter + 1;
    continue;
    case 'o':
    oCounter = oCounter + 1;
    continue;
    case 'u':
    uCounter = uCounter + 1;
    continue;
    default:
    }
  
  }

  System.out.println("Number of a's: " + aCounter);
  System.out.println("Number of e's: " + eCounter);
  System.out.println("Number of i's: " + iCounter);
  System.out.println("Number of o's: " + oCounter);
  System.out.println("Number of u's: " + uCounter);
  }
}
