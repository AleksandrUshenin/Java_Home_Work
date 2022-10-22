package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class NoteBooksBilder {
    private List<NoteBook> noteBookList;

    public NoteBooksBilder() {
        noteBookList = new ArrayList<>();
    }

    public List<NoteBook> getNoteBookList() {
        return noteBookList;
    }

    public List<String> getTags() {
        List<String> data = new ArrayList<>();
        for (var datalist : noteBookList) {
            data.add(datalist.getName());
            data.add("" + datalist.getWindowsSise());
            data.add("" + datalist.getRam());
            data.add("" + datalist.getMemory());
            data.add(datalist.getProcessor());
            data.add(datalist.getTypeWindows());
            data.add(datalist.getColor());
            data.add("" + datalist.getCost());
            data.add(datalist.getMarketName());
        }
        return data;
    }

    public void create(String name, String idConfig, String windowsSise,
                       String ram, String memory, String processor, String typeWindows, String color,
                       double cost, String marketName){
        noteBookList.add(new NoteBook(name, idConfig, windowsSise,
                ram, memory, processor, typeWindows, color, cost, marketName));
    }
}
