package beans;
 
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
 
@FacesValidator("passwordValidator")
public class PasswordValidator implements Validator {
 
	@Override
	public void validate(FacesContext context, UIComponent component,
		Object value) throws ValidatorException {
 
	  String newPassword = value.toString();
 
	  UIInput uiInputNewPasswordConfirmation = (UIInput) component.getAttributes()
		.get("newPasswordConfirmation");
	  String newPasswordConfirmation = uiInputNewPasswordConfirmation.getSubmittedValue()
		.toString();
 
	  // Let required="true" do its job.
	  if (newPassword == null || newPassword.isEmpty() || newPasswordConfirmation == null
		|| newPasswordConfirmation.isEmpty()) {
			return;
	  }
 
	  if (!newPassword.equals(newPasswordConfirmation)) {
		uiInputNewPasswordConfirmation.setValid(false);
		throw new ValidatorException(new FacesMessage(
			"Password must match confirm password."));
	  }
 
	}
}