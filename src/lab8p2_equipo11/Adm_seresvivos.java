package lab8p2_equipo11;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Adm_seresvivos {
File f;
ArrayList<SerVivo> list_vivo;
public Adm_seresvivos(String path){
    f = new File(path);
}
    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public ArrayList<SerVivo> getList_vivo() {
        return list_vivo;
    }

    public void setList_vivo(ArrayList<SerVivo> list_vivo) {
        this.list_vivo = list_vivo;
    }

    public void cargarArchivo() {
        try {
            list_vivo = new ArrayList();
            SerVivo temp;
            if (f.exists()) {
                FileInputStream entrada
                        = new FileInputStream(f);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SerVivo) objeto.readObject()) != null) {
                        list_vivo.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(f);
            bw = new ObjectOutputStream(fw);
            for (SerVivo t : list_vivo) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
