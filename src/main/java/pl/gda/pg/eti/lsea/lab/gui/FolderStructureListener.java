package pl.gda.pg.eti.lsea.lab.gui;

import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import pl.gda.pg.eti.lsea.lab.Node;

/**
 * Listener for all changes related to the folder structure. Currently, only prints out messages.
 * 
 * @author Tomasz Wierciński
 */
public class FolderStructureListener implements TreeModelListener {

    @Override
    public void treeNodesChanged(TreeModelEvent e) {
        System.out.println("INFO: Tree node(s) changed on path: " + e.getTreePath());
    }

    @Override
    public void treeNodesInserted(TreeModelEvent e) {
        System.out.println("INFO: New node(s) inserted on path: " + e.getTreePath());
    }

    @Override
    public void treeNodesRemoved(TreeModelEvent e) {
        System.out.println("INFO: Node(s) removed on path: " + e.getTreePath());
    }

    @Override
    public void treeStructureChanged(TreeModelEvent e) {
        System.out.println("INFO: Tree structure changed.");
    }
    
}
