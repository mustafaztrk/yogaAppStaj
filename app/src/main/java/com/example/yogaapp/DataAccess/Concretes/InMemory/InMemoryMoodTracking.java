package com.example.yogaapp.DataAccess.Concretes.InMemory;

import com.example.yogaapp.DataAccess.Abstracts.IMoodTracingDao;
import com.example.yogaapp.Entities.Concretes.MoodTracking;

import java.util.ArrayList;

public class InMemoryMoodTracking implements IMoodTracingDao {

   ArrayList<MoodTracking> _moodTrackings;

    public InMemoryMoodTracking() {
        MoodTracking rad= new MoodTracking();
        rad.setId("21321-fdsf321");
        rad.setCode("23123d-dfds3");
        rad.setTitle("Rad");
        ArrayList<String> wordRad=new ArrayList<String>();
        wordRad.add("süper, sırrını insanlarla paylaş");
        wordRad.add("böyle hissetmeye devam et");
        wordRad.add("güzel bir gün seni bekliyor");
        rad.setContent(wordRad);
        rad.setIconUrl("http://rad.icon.png");

        MoodTracking good= new MoodTracking();
        good.setId("21321-fdsf322");
        good.setCode("23123d-dfds3");
        good.setTitle("Good");
        ArrayList<String> wordGood=new ArrayList<String>();
        wordGood.add("mutluluk seni güzel gösteriyor!");
        wordGood.add("mutluluk bugün komşun ve sana çok yakın");
        wordGood.add("hayalini kurduğun mutluluk bugün seninle");
        good.setContent(wordGood);
        good.setIconUrl("http://good.icon.png");

        MoodTracking meh = new MoodTracking();
        meh.setId("21321-fdsf323");
        meh.setCode("23123d-dfds3");
        meh.setTitle("Meh");
        ArrayList<String> wordMeh=new ArrayList<String>();
        wordMeh.add("daha iyi hissedebilirsin, günün hala bitmedi!");
        wordMeh.add("her şey harika, yeter ki farkına var");
        wordMeh.add("günün en güzel saatleri henüz yeni başlıyor");
        meh.setContent(wordMeh);
        meh.setIconUrl("http://meh.icon.png");

        MoodTracking bad= new MoodTracking();
        bad.setId("21321-fdsf324");
        bad.setCode("23123d-dfds3");
        bad.setTitle("Bad");
        ArrayList<String> wordBad=new ArrayList<String>();
        wordBad.add("hissetmeye başla, bugün güzel bir gün!");
        wordBad.add("sorun yok, her şey yolunda");
        wordBad.add("kafanı rahatlat ve hissetmeye devam et");
        bad.setContent(wordBad);
        bad.setIconUrl("http://bad.icon.png");

        MoodTracking awful=new MoodTracking();
        awful.setId("21321-fdsf325");
        awful.setCode("23123d-dfds3");
        awful.setTitle("Awful");
        ArrayList<String> wordAwful=new ArrayList<String>();
        wordAwful.add("her ne yaşıyorsan senin için burada olduğumuzu bil!");
        wordAwful.add("unutma, harika hissetmek senin elinde");
        wordAwful.add("bugünü daha iyi yapmak için biraz meditasyona ne dersin?");
        awful.setContent(wordAwful);
        awful.setIconUrl("http://awful.icon.png");


        _moodTrackings= new ArrayList<MoodTracking>();
        _moodTrackings.add(rad);
        _moodTrackings.add(good);
        _moodTrackings.add(meh);
        _moodTrackings.add(bad);
        _moodTrackings.add(awful);
    }



    @Override
    public ArrayList<MoodTracking> GetAll() {
        return _moodTrackings;
    }

    @Override
    public void Add(MoodTracking entity) {
        _moodTrackings.add(entity);
    }

    @Override
    public void Update(MoodTracking entity) {

    }

    @Override
    public void Delete(MoodTracking entity) {

    }
}
