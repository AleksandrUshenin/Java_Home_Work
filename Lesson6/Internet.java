package Lesson6;

import java.util.*;

public class Internet {
    private List<NoteBook> datalist;
    private HashSet<String> selrctorValue;
    private String[] commands = { "view all", "select:" };// "view all type select"
    
    public Internet(List<NoteBook> datalist) {//List<BaseNoteBook>
        this.datalist = datalist;
        selrctorValue = new HashSet<>();
    }
    public Internet(List<NoteBook> datalist, List<String> selectirList) {
        this(datalist);
        loadSeleceor(selectirList);
    }
    private void loadSeleceor(List<String> selectirList){
        selrctorValue.addAll(selectirList);
    }
    public StringBuilder runCommand(String command){
        StringBuilder sb = new StringBuilder();
        switch (command){
            case "view all":
                for (var data : selrctorValue) {
                    sb.append(data + "\n");
                }
                return sb;
            default:
                if (command.length() > 0){
                    return getSelected(command.split(":")[1]);
                }
                break;
        }
        return null;
    }

    private StringBuilder getSelected(String select){
        StringBuilder sb = new StringBuilder();
        for (var data : datalist) {
            for (String linedata : data.tags().split(" : ")){
                if (linedata.equals(select)){
                    sb.append(data.tags() +"\n");
                }
            }
        }
        return sb;
    }
    public void setSelect(String TypeToSelect){}
}
