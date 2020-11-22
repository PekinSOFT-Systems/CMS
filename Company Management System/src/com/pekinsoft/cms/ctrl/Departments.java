/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and load the template in the editor.
 */

package com.pekinsoft.cms.ctrl;

import com.pekinsoft.cms.api.AbstractRecord;
import com.pekinsoft.cms.enums.SelectCompare;
import com.pekinsoft.cms.model.Department;
import com.pekinsoft.cms.view.MainFrame;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sean Carrick &lt;sean at pekinsoft dot com&gt;
 * 
 * @version 0.1.0
 * @since 0.1.0
 */
public class Departments extends AbstractRecord {
    //<editor-fold defaultstate="collapsed" desc="Public Static Constants">
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Private Member Fields">
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructor(s)">
    public Departments ( String folderName ) {
        super(folderName);
        
        if ( !load() )
            JOptionPane.showInternalMessageDialog(null, "No data files found!");
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Static Methods">
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Public Instance Methods">
    @Override
    public ArrayList performSort(String sortBy) {
        // Place implementation code here...
        /* ⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩ REMOVE ⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩ */
        throw new UnsupportedOperationException("Not supported yet."); /*<--*/
        /* ⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧ REMOVE ⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧ */
    }

    @Override
    public ArrayList selectRecords(String select, String from, String by, SelectCompare on) {
        // Place implementation code here...
        /* ⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩ REMOVE ⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩⇩ */
        throw new UnsupportedOperationException("Not supported yet."); /*<--*/
        /* ⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧ REMOVE ⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧⇧ */
    }
    
    public void delete(Department recordToRemove) {
        long id = recordToRemove.getId();
        
        for ( int x = 0; x < records.size(); x++ ) {
            if ( id == ((Department)records.get(x)).getId() ) {
                records.remove(x);
                break;
            }
        }
    }

    @Override
    protected boolean load() {
        // Check to see if the departments folder exists.
        File depts = new File(MainFrame.DATA_HOME + File.separator + folderName);
        
        boolean exists = depts.exists() && depts.isDirectory();
        
        if ( !exists ) 
            depts.mkdirs();
        
        else { // ~~~ exists == true ~~~
            
            // If the folder exists, we need to get all of the files, if there
            //+ are any, into our ArrayList.
            if ( depts.listFiles().length > 0 ) {
                File[] files = depts.listFiles();
            
                for ( File file : files ) {
                    // We need to read in the data.
                    try (ObjectInputStream in = new ObjectInputStream(new 
                            FileInputStream(file)) ) {
                        Department d = (Department)in.readObject();

                        // Then add it to our ArrayList.
                        this.addNew(d);
                    } catch ( IOException | ClassNotFoundException ex) {
                        exists = false;
                    }
                }
            }
        }
        
        return exists;
    }

    @Override
    public boolean save() {
        // Check to see if the departments folder exists.
        File depts = new File(MainFrame.DATA_HOME + File.separator + folderName);
        
        boolean exists = depts.exists() && depts.isDirectory();
        
        if ( exists ) {
            File[] files = depts.listFiles();
            
            // Remove all files within the directory.
            for ( File file : files ) {
                file.delete();
            }
            
            // Once the folder is empty, we can delete the folder itself.
            depts.delete();
            
            // Now that we've cleaned up the old data, we can recreate the folder.
            depts.mkdirs();
        } 
        
        // Now that all of the housekeeping is complete, we can write the data
        //+ out to the folder.
        try {
            for ( Object o : records ) {
                File data = new File(depts.getAbsolutePath() + File.separator
                        + ((Department)o).getId() + ".df");
                FileOutputStream fos = new FileOutputStream(data);
                ObjectOutputStream out = new ObjectOutputStream(fos);
                out.writeObject(o);
                out.close();
                fos.close();
            }
        } catch ( IOException ex ) {
            exists = false;
        }
        
        return exists;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Private Instance Methods">
    
    //</editor-fold>

}
