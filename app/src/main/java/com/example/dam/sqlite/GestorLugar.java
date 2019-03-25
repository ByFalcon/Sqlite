package com.example.dam.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.List;

import static com.example.dam.sqlite.MainActivity.LOG;

public class GestorLugar {

    private Ayudante ayudante;
    private SQLiteDatabase bd;

    public GestorLugar(Context c){
        this(c, true);
    }

    public GestorLugar(Context c, boolean write){
        Log.v(LOG, "constructor gestor");
        this.ayudante = new Ayudante(c);
        if(write){
            bd= ayudante.getWritableDatabase();
        }else{
            bd=ayudante.getReadableDatabase();
        }
    }

    public void cerrar(){
        ayudante.close();
    }

    //crud
    //create -> add, insert, persist
    public long add(Lugar lugar){
        //... objeto -> contentvalues
        return 0;
    }

    public long insert(Lugar lugar){
        return add(lugar);
    }

    public long persist(Lugar lugar){
        return add(lugar);
    }

    //read -> uno, todos, condicion + lista, cursor
    public List<Lugar> get(){
        //select all
        return get(null, null);
    }

    public List<Lugar> get(String condicion, String[] parametros){
        //todos los lugares que cumplan esa condicion
        //...
        return null;
    }

    public Lugar get(long id){
        //devuelve un lugar
        //...
        return null;
    }

    public Cursor getCursor(){
        return getCursor(null, null);
    }

    public Cursor getCursor(String condicion, String[] parametros){
        //...
        return null;
    }

    public Cursor getCursor(long id){
        return getCursor(Contrato.TableLugar._ID + " = ?",new String[]{id + ""});
    }

    //update -> edit - update - save
    public int edit(Lugar lugar){
        //objeto -> content values
        //...
        return 0;
    }

    //delete -> delete, erase, remove
    public int remove(Lugar l){
        return remove(l.getId());
    }

    public int remove(long id){
        //...
        return 0;
    }

    public static Lugar get(Cursor c){//devolver un objeto a partir de las columnas
        //...
        return null;
    }

    private static ContentValues contentValues(Lugar lugar){
        ContentValues contentValues = new ContentValues();
        //...
        return contentValues;
    }
}
