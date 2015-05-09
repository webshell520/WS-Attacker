/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2010 Christian Mainka
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.gui.component.config;

/**
 * @author dev
 */
public class Configuration
    extends javax.swing.JPanel
{

    /**
     * Creates new form Configuration
     */
    public Configuration()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        preferences = wsattacker.main.Preferences.getInstance();
        soapHttpClientConfigurationLabel = new javax.swing.JLabel();
        httpProxyHostLabel = new javax.swing.JLabel();
        httpProxyHostValue = new javax.swing.JTextField();
        httpProxyPortLabel = new javax.swing.JLabel();
        httpProxyPortValue = new javax.swing.JTextField();
        httpsProxyHostLabel = new javax.swing.JLabel();
        httpsProxyHostValue = new javax.swing.JTextField();
        httpsProxyPortLabel = new javax.swing.JLabel();
        httpsProxyPortValue = new javax.swing.JTextField();

        setName( "Configuration" ); // NOI18N

        soapHttpClientConfigurationLabel.setFont( new java.awt.Font( "Dialog", 1, 14 ) ); // NOI18N
        soapHttpClientConfigurationLabel.setText( "SOAP HTTP Client Configuration" );

        httpProxyHostLabel.setText( "http.proxyHost" );

        org.jdesktop.beansbinding.Binding binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  preferences,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${httpConfig.httpProxyHost}" ),
                                                                  httpProxyHostValue,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        httpProxyPortLabel.setText( "http.proxyPort" );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  preferences,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${httpConfig.httpProxyPort}" ),
                                                                  httpProxyPortValue,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        httpsProxyHostLabel.setText( "https.proxyHost" );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  preferences,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${httpConfig.httpsProxyHost}" ),
                                                                  httpsProxyHostValue,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        httpsProxyPortLabel.setText( "https.proxyPort" );

        binding =
            org.jdesktop.beansbinding.Bindings.createAutoBinding( org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE,
                                                                  preferences,
                                                                  org.jdesktop.beansbinding.ELProperty.create( "${httpConfig.httpsProxyPort}" ),
                                                                  httpsProxyPortValue,
                                                                  org.jdesktop.beansbinding.BeanProperty.create( "text" ) );
        bindingGroup.addBinding( binding );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout( this );
        this.setLayout( layout );
        layout.setHorizontalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( httpsProxyPortLabel,
                                                                                                                                                                                                                                                                                                                                                                                                 javax.swing.GroupLayout.Alignment.TRAILING ).addComponent( httpsProxyHostLabel,
                                                                                                                                                                                                                                                                                                                                                                                                                                                            javax.swing.GroupLayout.Alignment.TRAILING ).addComponent( httpProxyPortLabel,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.Alignment.TRAILING ).addComponent( httpProxyHostLabel,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  javax.swing.GroupLayout.Alignment.TRAILING ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addComponent( httpProxyHostValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       171,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( httpProxyPortValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              171,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( httpsProxyHostValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     171,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     javax.swing.GroupLayout.PREFERRED_SIZE ).addComponent( httpsProxyPortValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            171,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            javax.swing.GroupLayout.PREFERRED_SIZE ) ) ).addGroup( layout.createSequentialGroup().addGap( 12,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          12,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          12 ).addComponent( soapHttpClientConfigurationLabel ) ) ).addContainerGap( 90,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     Short.MAX_VALUE ) ) );
        layout.setVerticalGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING ).addGroup( layout.createSequentialGroup().addContainerGap().addComponent( soapHttpClientConfigurationLabel ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( httpProxyHostLabel ).addComponent( httpProxyHostValue,
                                                                                                                                                                                                                                                                                                                                                                                                                               javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                               javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                               javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( httpProxyPortLabel ).addComponent( httpProxyPortValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( httpsProxyHostLabel ).addComponent( httpsProxyHostValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          javax.swing.GroupLayout.PREFERRED_SIZE ) ).addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED ).addGroup( layout.createParallelGroup( javax.swing.GroupLayout.Alignment.BASELINE ).addComponent( httpsProxyPortLabel ).addComponent( httpsProxyPortValue,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE ) ).addContainerGap( 267,
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            Short.MAX_VALUE ) ) );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel httpProxyHostLabel;

    private javax.swing.JTextField httpProxyHostValue;

    private javax.swing.JLabel httpProxyPortLabel;

    private javax.swing.JTextField httpProxyPortValue;

    private javax.swing.JLabel httpsProxyHostLabel;

    private javax.swing.JTextField httpsProxyHostValue;

    private javax.swing.JLabel httpsProxyPortLabel;

    private javax.swing.JTextField httpsProxyPortValue;

    private wsattacker.main.Preferences preferences;

    private javax.swing.JLabel soapHttpClientConfigurationLabel;

    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
