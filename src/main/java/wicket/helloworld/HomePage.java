package wicket.helloworld;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.ajax.AjaxEventBehavior;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", "Barbarillo"));
		
		TextField<String> txtUsername = new TextField<String>("username");
		txtUsername.setOutputMarkupId(true);
		txtUsername.add(new AjaxEventBehavior("click") {
			@Override
			protected void onEvent(AjaxRequestTarget target) {
				// TODO Auto-generated method stub
				System.out.println(txtUsername.getInput());
			}
		});
		txtUsername.add(new AjaxEventBehavior("keypress") {
			@Override
			protected void onEvent(AjaxRequestTarget target) {
				System.out.println(txtUsername.getInput());
			}
		});
		add(txtUsername);
		//add(new TextField<String>("username", Model.of("Barbarillo")));
		// TODO Add your page's components here

	}
}
