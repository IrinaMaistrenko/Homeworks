package Homework5;

public class EasySearch implements ISearchEngine{
    @Override
    public long search(String text, String word) {
        long counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.insert(0, " ").append(word).append(" ");
        int index = text.indexOf(String.valueOf(stringBuilder));
        while (index != -1){
            counter++;
            index = text.indexOf(String.valueOf(stringBuilder), index+1);
        }
        return counter;
    }
}
