import java.util.Scanner;
public class texteditor{
    public  static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String initialText = sc.nextLine();
        System.out.println("Initial Text: " + initialText);

        StringBuffer inputText = new StringBuffer(initialText);

        System.out.println("current Text: "+inputText);
        
        int choice;
        do {
            System.out.println("+++++++++++ Text Editor Menu +++++++++++");
            System.out.println("1. Append Text");
            System.out.println("2. Insert Text");
            System.out.println("3. Replace Text");
            System.out.println("4. Delete Text");
            System.out.println("5. Reverse Text");
            System.out.println("6. Set Specific Character");
            System.out.println("7. Set Length");
            System.out.println("8. Show character at specific index");
            System.out.println("9. show Capacity and Length");
            System.out.println("10. Exit");
            System.out.print("Enter your choice (1-10): ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text to append: ");
                    String appendtext = sc.nextLine();
                    inputText.append(" ");
                    inputText.append(appendtext);
                    System.out.println("\nCurrent Text: " + inputText+"\n");
                    break;
                case 2:
                    System.out.print("Enter index to insert text: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if(index >= 0 && index < inputText.length())
                    {
                        System.out.print("Enter text to insert: ");
                        String insertText = sc.nextLine();
                        inputText.insert(index, insertText);
                        System.out.println("\nCurrent Text: " + inputText+"\n");
                    }
                    else
                    {
                        System.out.println("Invalid Index");
                    }
                    break;
                case 3:
                    System.out.print("Enter the starting index: ");
                    int startindex = sc.nextInt();
                    System.out.print("Enter the ending index: ");
                    int endindex = sc.nextInt();
                    sc.nextLine();
                    if(startindex >= 0 && endindex <= inputText.length() && startindex < endindex)
                    {
                        System.out.print("Enter text to replace: ");
                        String replaceText = sc.nextLine();
                        inputText.replace(startindex,endindex+1,replaceText);
                        System.out.println("\nCurrent text: "+inputText+"\n");
                    }
                    else
                    {
                        System.out.println("Replacement NOT possible");
                    }
                    break;
                case 4:
                    System.out.print("Enter the starting index: ");
                    int startdelindex = sc.nextInt();
                    System.out.print("Eter the ending index: ");
                    int enddelindex = sc.nextInt();
                    sc.nextLine();
                    if(startdelindex >= 0 && enddelindex <= inputText.length() && startdelindex < enddelindex)
                    {
                        inputText.delete(startdelindex,enddelindex);
                        System.out.println("Current text: "+inputText);
                    }
                    else
                    {
                        System.out.println("Deletion not possible");
                    }
                    break;
                case 5:
                    inputText.reverse();
                    System.out.println("Current text: "+inputText);
                    break;
                case 6:
                    System.out.print("Enter the index position: ");
                    int charindex = sc.nextInt();
                    if(charindex>=0 && charindex<initialText.length())
                    {
                        System.out.print("Enter the character: ");
                        char ch =sc.next().charAt(0);
                        inputText.setCharAt(charindex, ch);
                        System.out.println("Current text: "+inputText);
                    }
                    else
                    {
                        System.out.println("Setting character not possible");
                    }
                    break;
                case 7:
                    System.out.print("Enter the length to setup: ");
                    int setlength = sc.nextInt();
                    System.out.println("Length before: "+inputText.length());
                    inputText.setLength(setlength);
                    System.out.println("Length after: "+inputText.length());
                    break;
                case 8:
                    System.out.print("Enter index: ");
                    int showindex = sc.nextInt();
                    sc.nextLine();
                    if(showindex >=0 || showindex<inputText.length())
                    {
                        System.out.println(inputText.charAt(showindex));
                    }
                    else
                    {
                        System.err.println("Invalid index");
                    }
                    break;
                case 10:
                    System.out.println("Exiting the text editor.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while(true);

    }
}