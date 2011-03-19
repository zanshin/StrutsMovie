package movielist.action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import movielist.map.ObjectNotFoundException;
import movielist.map.ServerFailureException;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public abstract class LoggedOnAction extends ErrorHandlingAction {

	public final ActionForward performMovieList(ActionMapping mapping,
									   ActionForm form,
									   HttpServletRequest request,
									   HttpServletResponse response)
		throws IOException, ServletException, ServerFailureException, ObjectNotFoundException {

		String s = (String) request.getSession().getAttribute("loggedIn");
		s = request.getSession().getId();

		if ("Y".equals(request.getSession().getAttribute("loggedIn"))) {
			return performLoggedIn(mapping, form, request, response);
		} else {
			return mapping.findForward("logoff");
		}
	}

	// template method called if, and only if, the user is logged in properly
	protected abstract ActionForward performLoggedIn(ActionMapping mapping,
												  ActionForm form,
												  HttpServletRequest request,
												  HttpServletResponse response)
		throws IOException, ServletException, ServerFailureException, ObjectNotFoundException;
}