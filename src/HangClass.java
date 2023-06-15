import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class HangClass extends HangMain {
    

 // Keywords
 public static final String[] WORDS = {
  "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", 
  "CASE", "CATCH", "BAR", "CLASS", "SELL",
  "CONTINUE", "DEFAULT", "DOUBLE", "DO", "ELSE", 
  "KILL", "EXTENDS", "FALSE", "FINAL", "FINALLY",
  "FLOAT", "FOR", "GOT", "IF", "IMPLEMENTS", 
  "IMPORT", "INSTANCE", "DILL", "INTERFACE", 
  "LONG", "NATIVE", "NEW", "NULL", "PACKAGE", 
  "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
  "SHORT", "STATIC", "STRICT", "SUPER", "SWITCH", 
  "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
  "TRANSIENT", "TRUE", "TRY", "VOID", "VOLATILE", "WHILE"
 };

 public static final Random RANDOM = new Random();
 public static final int MAX_ERRORS = 8;
 private String wordToFind;
 private char[] wordFound;
 private int nbErrors;
 private ArrayList < String > letters = new ArrayList < > ();

 private String nextWordToFind() {
  return WORDS[RANDOM.nextInt(WORDS.length)];
 }

 public void newGame() {
  nbErrors = 0;
  letters.clear();
  wordToFind = nextWordToFind();
  wordFound = new char[wordToFind.length()];

  for (int i = 0; i < wordFound.length; i++) {
   wordFound[i] = '_';
  }
 }


 public boolean wordFound() {
  return wordToFind.contentEquals(new String(wordFound));
 }


 private void enter(String c) {

  if (!letters.contains(c)) {

   if (wordToFind.contains(c)) {

    int index = wordToFind.indexOf(c);

    while (index >= 0) {
     wordFound[index] = c.charAt(0);
     index = wordToFind.indexOf(c, index + 1);
    }
   } else {

    nbErrors++;
   }


   letters.add(c);
  }
 }


 private String wordFoundContent() {
  StringBuilder builder = new StringBuilder();

  for (int i = 0; i < wordFound.length; i++) {
   builder.append(wordFound[i]);

   if (i < wordFound.length - 1) {
    builder.append(" ");
   }
  }

  return builder.toString();
 }

 public void play() {
  try (Scanner input = new Scanner(System.in)) {

   while (nbErrors < MAX_ERRORS) {
    System.out.println("\nEnter a letter : ");
   set("Enter a letter");

    String str = input.next();

    if (str.length() > 1) {
     str = str.substring(0, 1);
    }

    enter(str);


    System.out.println("\n" + wordFoundContent());

    
    
    

    if (wordFound()) {
     System.out.println("\nYou win!");
     break;
    } else {
     System.out.println("\n=> Nb tries remaining : " + (MAX_ERRORS - nbErrors)); 
    }
   }

   
   
   if (nbErrors == MAX_ERRORS) {
    System.out.println("\nYou lose!");
    System.out.println("=> Word to find was : " + wordToFind);
   }
  }
 }

 public static void main(String[] args) {
  System.out.println("Hangman Game with Java Keywords :)");
  HangClass hangmanGame = new HangClass();
  hangmanGame.newGame();
  hangmanGame.play();
 }
 

 
} 

        
   
