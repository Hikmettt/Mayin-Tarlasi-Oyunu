/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MayinTarlasi;

import java.util.TimerTask;
import javax.swing.JLabel;



    public  class ZamanTutucu extends TimerTask {
  
        private JLabel label;
        private int i  = 0;
        public ZamanTutucu(JLabel label) {
            this.label = label;
        }
        
          @Override
      public void run() {
       label.setText("Sure : " + (i++));
   }
                
               
    }