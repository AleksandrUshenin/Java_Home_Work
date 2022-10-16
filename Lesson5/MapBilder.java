package Lesson5;

import java.util.*;
/**
 * MapBilder
 */
public class MapBilder {
    private Maper HeadData;
    //private Maper TailData;
    private int count;

    public MapBilder(){
        count = 0;
    }

    public void add(int data){
        if(HeadData == null){
            HeadData = new Maper(data);
        }
        else {
            Maper sears = HeadData;
            boolean res = true;
            while (res){
                //res = adder(sears, data);
                if (data < sears.getData()){
                    if(sears.getnextLeft() != null){
                        sears = sears.getnextLeft();
                        res = true;
                    }
                    else {
                        Maper m = new Maper(data);
                        m.addLink(sears);
                        sears.addnextLeft(m);
                        count++;
                        res = false;
                    }
                }
                else if (data > sears.getData()) {
                    if(sears.getnextRight() != null){
                        sears = sears.getnextRight();
                        res = true;
                    }
                    else {
                        Maper m = new Maper(data);
                        m.addLink(sears);
                        sears.addnextRight(m);
                        count++;
                        res = false;
                    }

                }
            }
        }
    }
    public void add(Maper data){
        if (data == null){
            return;
        }
        if(HeadData == null){
            HeadData = data;
        }
        else {
            Maper sears = HeadData;
            boolean res = true;
            while (res){
                //res = adder(sears, data);
                if (data.getData() < sears.getData()){
                    if(sears.getnextLeft() != null){
                        sears = sears.getnextLeft();
                        res = true;
                    }
                    else {
                        data.addLink(sears);
                        sears.addnextLeft(data);
                        count++;
                        res = false;
                    }
                }
                else if (data.getData() > sears.getData()) {
                    if(sears.getnextRight() != null){
                        sears = sears.getnextRight();
                        res = true;
                    }
                    else {
                        data.addLink(sears);
                        sears.addnextRight(data);
                        count++;
                        res = false;
                    }

                }
            }
        }
    }
    public void add(int[] arr){
        for (int data : arr) {
            add(data);
        }
    }
    public void add(List<Integer> list){
        var arr = list.toArray(Integer[]::new);
        //add();
    }
    public int[] getArr(){
        //int[] arr = new int[count];
        List<Integer> list = new ArrayList<>();
        boolean raz = true;
        Maper m = HeadData;
        Maper m2 = HeadData;
        list.add(HeadData.getData());
        while (raz){
            m = m.getnextLeft();
            if (m != null){
                list.add(m.getData());
            }
            m = m.getLink().getnextRight();
            if (m != null){
                list.add(m.getData());
            }
        }
        return null;
    }
    private boolean adder(Maper sears, int data){
        if (data < sears.getData()){
            if(sears.getnextLeft() != null){
                sears = sears.getnextLeft();
                return true;
            }
            else {
                Maper m = new Maper(data);
                m.addLink(sears);
                sears.addnextLeft(m);
                count++;
            }
            return false;
        }
        else if (data > sears.getData()) {
            if(sears.getnextRight() != null){
                sears = sears.getnextRight();
                return true;
            }
            else {
                Maper m = new Maper(data);
                m.addLink(sears);
                sears.addnextRight(m);
                count++;
            }
            return false;
        }
        else {}
        return false;
    }

    public int getCiunt(){
        return count;
    }
    public void delite(int value){
        boolean raz = true;
        Maper sears = HeadData;
        while (raz){
            if (sears.getData() > value){
                if (sears.getnextLeft() != null){
                    sears = sears.getnextLeft();
                    raz = true;
                }
            } else if (sears.getData() < value) {
                if (sears.getnextRight() != null){
                    sears = sears.getnextRight();
                    raz = true;
                }
            }
            else{
                if (sears.getnextLeft() == null && sears.getnextRight() == null){
                    if (value > sears.getLink().getData()){
                        sears.getLink().addnextRight(null);
                        raz = false;
                        count--;
                    }
                    if (value < sears.getLink().getData()){
                        sears.getLink().addnextLeft(null);
                        raz = false;
                        count--;
                    }
                    sears.addLink(null);
                }
                else {
                    if(sears.getnextRight() != null){
                        Maper m = sears.getLink();
                    }
                    if (value > sears.getLink().getData()){
                        Maper ml = sears;
                        sears = sears.getLink();
                        sears.addnextRight(null);
                        add(ml.getnextRight());
                        add(ml.getnextLeft());
                        raz = false;
                        count--;
                    }
                    else if (value < sears.getLink().getData()){
                        Maper mr = sears;
                        sears = sears.getLink();
                        sears.addnextLeft(null);
                        add(mr.getnextRight());
                        add(mr.getnextLeft());
                        raz = false;
                        count--;
                    }
                }
            }
        }
    }   
    public List<Integer> getSorter(){
        List<Integer> list = new ArrayList<>();
        Maper maper = HeadData;
        maper = sorter(maper);
        Maper maper2 = maper;
        Maper m2 = null;
        boolean raz = true;
        while(raz){
            if (maper.getnextLeft() != null){
                maper = maper.getnextLeft();
                m2 = maper;
            }
            else{ 
                list.add(m2.getData());
                if (m2.getLink() != null){
                    m2 = m2.getLink();
                }
                else{
                    raz = false;
                }
            }
        }
        raz = true;
        maper = maper2;
        while(raz){
            if (maper.getnextRight() != null){
                maper = maper.getnextRight();
                list.add(maper.getData());
            }
            else{ 
                raz = false;
            }
        }
        return list;
    }
    private Maper sorter2(Maper maper){
        if (maper.getnextRight() != null){
            if (maper.getData() < maper.getnextRight().getData()){
                Maper m = maper.getLink();
                // if (maper.getLink() != null){
                //     if (m.getData() > maper.getData()){
                //         m.addnextRight(maper.getnextRight());
                //     }
                //     else{
                //         m.addnextLeft(maper.getnextRight());
                //     }
                // }

                m = maper.getLink(); 
                maper.addLink(maper.getnextRight());
                maper.getnextRight().addLink(m);
    
                m = maper.getnextLeft();
                maper.addnextLeft(maper.getnextRight().getnextLeft());
                maper.getnextRight().addnextLeft(m);
    
                m = maper.getnextRight().getnextRight();
                maper.getnextRight().addnextRight(maper);
                maper.addnextRight(m);
                
                maper = maper.getLink();
            }
            if (maper.getnextRight() != null && maper.getnextRight().getnextRight() != null){
                sorter2(maper.getnextRight().getnextRight());
            }
        }
        if (maper.getnextLeft() != null){
            if(maper.getData() < maper.getnextLeft().getData()){
                Maper m = maper.getLink();
                // if (maper.getLink() != null){
                //     if (m.getData() > maper.getData()){
                //         m.addnextRight(maper.getnextLeft());
                //     }
                //     else{
                //         m.addnextLeft(maper.getnextLeft());
                //     }
                // }

                m = maper.getLink(); 
                maper.addLink(maper.getnextRight());
                maper.getnextRight().addLink(m);
    
                m = maper.getnextLeft();
                maper.addnextLeft(maper.getnextRight().getnextLeft());
                maper.getnextRight().addnextLeft(m);
    
                m = maper.getnextRight().getnextRight();
                maper.getnextRight().addnextRight(maper);
                maper.addnextRight(m);
            }
            if (maper.getnextLeft() != null && maper.getnextLeft().getnextLeft() != null){
                sorter2(maper.getnextLeft().getnextLeft());   
            }
        }
        return maper;
    }
    private Maper sorter(Maper maper){
        if (maper.getnextRight() != null){

            if (maper.getData() > maper.getnextRight().getData()){
                
                Maper m = maper.getLink();

                m = maper.getLink(); 
                maper.addLink(maper.getnextRight());
                maper.getnextRight().addLink(m);
    
                m = maper.getnextLeft();
                maper.addnextLeft(maper.getnextRight().getnextLeft());
                maper.getnextRight().addnextLeft(m);
    
                m = maper.getnextRight().getnextRight();
                maper.getnextRight().addnextRight(maper);
                maper.addnextRight(m);
                
                maper = maper.getLink();
            }
            else if (maper.getLink() != null && maper.getnextRight().getData() < maper.getLink().getData()){
                    Maper m1 = null;
                    Maper m2 = null;
                    Maper m = maper.getLink();

                    if (maper.getnextRight().getnextLeft() != null){
                        m1 = maper.getnextRight().getnextLeft();
                    }
                    if (maper.getnextRight().getnextRight() != null){
                        m2 = maper.getnextRight().getnextRight();
                    }

                    maper.getLink().addnextLeft(maper.getnextRight());
                    maper.getnextRight().addnextLeft(maper);

                    maper.addLink(maper.getnextRight());
                    maper.getnextRight().addLink(m);
                
                    maper.addnextRight(null);

                    add(m1);
                    add(m2);
            }
            if (maper.getnextRight() != null){
                sorter(maper.getnextRight());
            }
        }
        if (maper.getnextLeft() != null){
            if ( maper.getLink() != null && maper.getnextLeft().getData() > maper.getLink().getData())
            {
                Maper m1 = null;
                Maper m2 = null;
                Maper m = maper.getLink();

                if (maper.getnextLeft().getnextLeft() != null){
                    m1 = maper.getnextLeft().getnextLeft();
                }
                if (maper.getnextLeft().getnextRight() != null){
                    m2 = maper.getnextLeft().getnextRight();
                }

                maper.getLink().addnextRight(maper.getnextLeft());
                maper.getnextLeft().addnextRight(maper);

                maper.addLink(maper.getnextLeft());
                maper.getnextLeft().addLink(m);
                
                maper.addnextLeft(null);

                add(m1);
                add(m2);
            }
            if(maper.getnextLeft() != null && maper.getData() < maper.getnextLeft().getData()){
                Maper m = maper.getLink();

                m = maper.getLink(); 
                maper.addLink(maper.getnextRight());
                maper.getnextRight().addLink(m);
    
                m = maper.getnextLeft();
                maper.addnextLeft(maper.getnextRight().getnextLeft());
                maper.getnextRight().addnextLeft(m);
    
                m = maper.getnextRight().getnextRight();
                maper.getnextRight().addnextRight(maper);
                maper.addnextRight(m);
            }
            if (maper.getnextLeft() != null){
                sorter(maper.getnextLeft());   
            }
        }
        return maper;
    }

}