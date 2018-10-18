package org.openxava.actions;

/**
 * 
 * @since 5.7
 * @author Javier Paniza
 */
public class RemoveListConfigurationAction extends TabBaseAction {

	public void execute() throws Exception {
		getTab().removeConfiguration();
		addMessage("list_configuration_removed"); 
		closeDialog();
	}

}
