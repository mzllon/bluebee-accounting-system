package com.bluebee.action;

import com.bluebee.ui.frame.GkJLPanel;
import com.bluebee.ui.frame.PageContainer;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;

public class GkJlAction extends AbstractAction
{
  public void actionPerformed(ActionEvent e)
  {
    PageContainer.getInstance().setDefaultPage(GkJLPanel.getInstance());
  }
}