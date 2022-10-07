/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ProjectController;
import controller.TaskController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.TaskTableModel;

/**
 *
 * @author vito
 */
public class Home extends javax.swing.JFrame {

   ProjectController projectController;
   TaskController taskController;
   
   DefaultListModel projectsModel;
   TaskTableModel taskModel;
   
   public Home() {
      initComponents();
      decorateTableTasks();
      initDataController(); 
      initComponentsModel();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanelEmptyList = new javax.swing.JPanel();
      jLabelEmptyListSubtitle = new javax.swing.JLabel();
      jLabelEmptyListIcon = new javax.swing.JLabel();
      jLabelEmptyListTitle = new javax.swing.JLabel();
      jPanelToolBar = new javax.swing.JPanel();
      jLabelToolBarTitle = new javax.swing.JLabel();
      jLabelToolBarSubtitle = new javax.swing.JLabel();
      jPanelProjects = new javax.swing.JPanel();
      jLabelProjectsTitle = new javax.swing.JLabel();
      jLabelProjectsAdd = new javax.swing.JLabel();
      jPanelTasks = new javax.swing.JPanel();
      jLabelTasksTitle = new javax.swing.JLabel();
      jLabelTasksAdd = new javax.swing.JLabel();
      jPanelProjectList = new javax.swing.JPanel();
      jScrollPaneProjects = new javax.swing.JScrollPane();
      jListProjects = new javax.swing.JList<>();
      jPanel5 = new javax.swing.JPanel();
      jScrollPaneTasks = new javax.swing.JScrollPane();
      jTableTasks = new javax.swing.JTable();

      jPanelEmptyList.setBackground(java.awt.Color.white);

      jLabelEmptyListSubtitle.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jLabelEmptyListSubtitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabelEmptyListSubtitle.setText("Clique no botão + para adicionar uma nova tarefa");

      jLabelEmptyListIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabelEmptyListIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lists.png"))); // NOI18N

      jLabelEmptyListTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jLabelEmptyListTitle.setForeground(new java.awt.Color(0, 153, 102));
      jLabelEmptyListTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabelEmptyListTitle.setText("Nenhuma tarefa por aqui :D");

      javax.swing.GroupLayout jPanelEmptyListLayout = new javax.swing.GroupLayout(jPanelEmptyList);
      jPanelEmptyList.setLayout(jPanelEmptyListLayout);
      jPanelEmptyListLayout.setHorizontalGroup(
         jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jLabelEmptyListIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(jPanelEmptyListLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelEmptyListTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
            .addContainerGap())
         .addComponent(jLabelEmptyListSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
      );
      jPanelEmptyListLayout.setVerticalGroup(
         jPanelEmptyListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelEmptyListLayout.createSequentialGroup()
            .addGap(101, 101, 101)
            .addComponent(jLabelEmptyListIcon)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelEmptyListTitle)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelEmptyListSubtitle)
            .addContainerGap(78, Short.MAX_VALUE))
      );

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setMinimumSize(new java.awt.Dimension(800, 600));

      jPanelToolBar.setBackground(new java.awt.Color(0, 153, 102));
      jPanelToolBar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

      jLabelToolBarTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
      jLabelToolBarTitle.setForeground(new java.awt.Color(255, 255, 255));
      jLabelToolBarTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/check.png"))); // NOI18N
      jLabelToolBarTitle.setText("ToDo App");
      jLabelToolBarTitle.setMaximumSize(new java.awt.Dimension(688, 512));
      jLabelToolBarTitle.setMinimumSize(new java.awt.Dimension(688, 512));

      jLabelToolBarSubtitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jLabelToolBarSubtitle.setForeground(new java.awt.Color(255, 255, 255));
      jLabelToolBarSubtitle.setText("Anote tudo, não esqueça de nada");

      javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
      jPanelToolBar.setLayout(jPanelToolBarLayout);
      jPanelToolBarLayout.setHorizontalGroup(
         jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelToolBarLayout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
               .addComponent(jLabelToolBarSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE))
            .addContainerGap())
      );
      jPanelToolBarLayout.setVerticalGroup(
         jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelToolBarLayout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelToolBarSubtitle)
            .addContainerGap(18, Short.MAX_VALUE))
      );

      jPanelProjects.setBackground(new java.awt.Color(255, 255, 255));
      jPanelProjects.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jLabelProjectsTitle.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
      jLabelProjectsTitle.setForeground(new java.awt.Color(0, 153, 102));
      jLabelProjectsTitle.setText("Projetos");

      jLabelProjectsAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
      jLabelProjectsAdd.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabelProjectsAddMouseClicked(evt);
         }
      });

      javax.swing.GroupLayout jPanelProjectsLayout = new javax.swing.GroupLayout(jPanelProjects);
      jPanelProjects.setLayout(jPanelProjectsLayout);
      jPanelProjectsLayout.setHorizontalGroup(
         jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelProjectsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanelProjectsLayout.setVerticalGroup(
         jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelProjectsLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelProjectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabelProjectsAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabelProjectsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      jPanelTasks.setBackground(new java.awt.Color(255, 255, 255));
      jPanelTasks.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jLabelTasksTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jLabelTasksTitle.setForeground(new java.awt.Color(0, 152, 102));
      jLabelTasksTitle.setText("Tarefas");

      jLabelTasksAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
      jLabelTasksAdd.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            jLabelTasksAddMouseClicked(evt);
         }
      });

      javax.swing.GroupLayout jPanelTasksLayout = new javax.swing.GroupLayout(jPanelTasks);
      jPanelTasks.setLayout(jPanelTasksLayout);
      jPanelTasksLayout.setHorizontalGroup(
         jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelTasksLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelTasksAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );
      jPanelTasksLayout.setVerticalGroup(
         jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTasksLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanelTasksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanelTasksLayout.createSequentialGroup()
                  .addGap(0, 0, Short.MAX_VALUE)
                  .addComponent(jLabelTasksAdd))
               .addComponent(jLabelTasksTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      jPanelProjectList.setBackground(new java.awt.Color(255, 255, 255));
      jPanelProjectList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jListProjects.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
      jListProjects.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      jListProjects.setFixedCellHeight(25);
      jListProjects.setSelectionBackground(new java.awt.Color(0, 153, 102));
      jScrollPaneProjects.setViewportView(jListProjects);

      javax.swing.GroupLayout jPanelProjectListLayout = new javax.swing.GroupLayout(jPanelProjectList);
      jPanelProjectList.setLayout(jPanelProjectListLayout);
      jPanelProjectListLayout.setHorizontalGroup(
         jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelProjectListLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPaneProjects)
            .addContainerGap())
      );
      jPanelProjectListLayout.setVerticalGroup(
         jPanelProjectListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanelProjectListLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPaneProjects)
            .addContainerGap())
      );

      jPanel5.setBackground(new java.awt.Color(255, 255, 255));
      jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

      jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
         },
         new String [] {
            "Nome", "Descrição", "Prazo", "Tarefa Concluida"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class
         };
         boolean[] canEdit = new boolean [] {
            false, false, false, true
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }

         public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
         }
      });
      jTableTasks.setRowHeight(40);
      jTableTasks.setSelectionBackground(new java.awt.Color(204, 255, 204));
      jTableTasks.setSelectionForeground(java.awt.Color.white);
      jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
      jTableTasks.setShowHorizontalLines(true);
      jScrollPaneTasks.setViewportView(jTableTasks);

      javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
      jPanel5.setLayout(jPanel5Layout);
      jPanel5Layout.setHorizontalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jScrollPaneTasks, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
      );
      jPanel5Layout.setVerticalGroup(
         jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel5Layout.createSequentialGroup()
            .addComponent(jScrollPaneTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jPanelProjects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanelTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jPanelProjectList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jLabelProjectsAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelProjectsAddMouseClicked
      ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
      projectDialogScreen.setVisible(true);
      
      projectDialogScreen.addWindowListener(new WindowAdapter(){
         public void windowClosed(WindowEvent e){
            loadProjects();
         }
      });
      
   }//GEN-LAST:event_jLabelProjectsAddMouseClicked

   private void jLabelTasksAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTasksAddMouseClicked
      TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
      //taskDialogScreen.setProject(null);
      taskDialogScreen.setVisible(true);
      
   }//GEN-LAST:event_jLabelTasksAddMouseClicked

   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
      /* Set the Nimbus look and feel */
      //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
      /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
       */
      try {
         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Java swing".equals(info.getName())) {
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Home().setVisible(true);
         }
      });

   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabelEmptyListIcon;
   private javax.swing.JLabel jLabelEmptyListSubtitle;
   private javax.swing.JLabel jLabelEmptyListTitle;
   private javax.swing.JLabel jLabelProjectsAdd;
   private javax.swing.JLabel jLabelProjectsTitle;
   private javax.swing.JLabel jLabelTasksAdd;
   private javax.swing.JLabel jLabelTasksTitle;
   private javax.swing.JLabel jLabelToolBarSubtitle;
   private javax.swing.JLabel jLabelToolBarTitle;
   private javax.swing.JList<String> jListProjects;
   private javax.swing.JPanel jPanel5;
   private javax.swing.JPanel jPanelEmptyList;
   private javax.swing.JPanel jPanelProjectList;
   private javax.swing.JPanel jPanelProjects;
   private javax.swing.JPanel jPanelTasks;
   private javax.swing.JPanel jPanelToolBar;
   private javax.swing.JScrollPane jScrollPaneProjects;
   private javax.swing.JScrollPane jScrollPaneTasks;
   private javax.swing.JTable jTableTasks;
   // End of variables declaration//GEN-END:variables

   public void decorateTableTasks() {
      //Customizando o header da table de tarefas
      jTableTasks.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
      jTableTasks.getTableHeader().setBackground(new Color(0, 153, 102));
      jTableTasks.getTableHeader().setForeground(new Color(255, 255, 255));
      //Criando organizar automatico para as colunas da tabela
      jTableTasks.setAutoCreateRowSorter(true);
   }
   public void initDataController(){
      projectController = new ProjectController();
      taskController = new TaskController();
      
   }
   
   public void initComponentsModel(){
      projectsModel = new DefaultListModel();
      loadProjects();
      
      taskModel = new TaskTableModel();
      jTableTasks.setModel(taskModel);
      loadTasks(1);
      
   }
   
   public void loadTasks(int idProject){
      List<Task> tasks = taskController.getAll(idProject);
      taskModel.setTasks(tasks);
   }
   
   public void loadProjects(){
      List<Project> projects = projectController.getAll();
      
      projectsModel.clear();
      
      for(int i = 0; i<projects.size(); i++){
         Project project = projects.get(i);
         projectsModel.addElement(project);
      }
      jListProjects.setModel(projectsModel);
   }
}