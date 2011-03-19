package movielist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import movielist.business.BusinessDelegate;
//import movielist.map.ObjectNotFoundException;
import movielist.map.ServerFailureException;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AddMovieAction extends LoggedOnAction {
	private static String CLASS_NAME = AddMovieAction.class.getName();

	public ActionForward performLoggedIn(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response)
		throws
			ServerFailureException {

		BusinessDelegate bp;
		bp = BusinessDelegate.getInstance();
		request.setAttribute("movieRatings", bp.getAllMovieRatings());

		return mapping.findForward("success");
	}
}