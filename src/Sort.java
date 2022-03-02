import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSortWordList(String[] elements)
    {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k].compareTo(elements[minIndex]) < 0)
                {
                    minIndex = k;
                }
                count++;
            }
            String temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println(count);
    }

    public static void insertionSort(String[] elements)
    {
        int count = 0;
        for (int j = 1; j < elements.length; j++)
        {
            String temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(elements[possibleIndex - 1]) < 0)
            {
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
                count++;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println(count);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        int count = 0;
        for (int j = 0; j < words.size() - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < words.size(); k++)
            {
                if (words.get(k).compareTo(words.get(minIndex)) < 0)
                {
                    minIndex = k;
                }
                count++;
            }
            String temp = words.get(j);
            words.set(j, words.get(minIndex));
            words.set(minIndex, temp);
        }
        System.out.println(count);
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        int count = 0;
        for (int j = 1; j < words.size(); j++)
        {
            String temp = words.get(j);
            int possibleIndex = j;
            while (possibleIndex > 0 && temp.compareTo(words.get(possibleIndex - 1)) < 0)
            {
                words.set(possibleIndex, words.get(possibleIndex - 1));
                possibleIndex--;
                count++;
            }
            words.set(possibleIndex, temp);
        }
        System.out.println(count);
    }
}