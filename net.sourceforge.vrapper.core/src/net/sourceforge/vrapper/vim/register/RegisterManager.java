package net.sourceforge.vrapper.vim.register;

import net.sourceforge.vrapper.utils.PositionlessSelection;
import net.sourceforge.vrapper.utils.Search;
import net.sourceforge.vrapper.vim.commands.Command;
import net.sourceforge.vrapper.vim.commands.TextOperation;
import net.sourceforge.vrapper.vim.commands.motions.FindMotion;

/**
 * Provides access to different registers.
 *
 * @author Matthias Radig
 */
public interface RegisterManager {

    public static final String REGISTER_NAME_UNNAMED   = "\"";
    public static final String REGISTER_NAME_INSERT    = ".";
    public static final String REGISTER_NAME_CLIPBOARD = "*";
    public static final String REGISTER_NAME_SEARCH    = "/";
    public static final String REGISTER_SMALL_DELETE   = "-";
    public static final String REGISTER_NAME_BLACKHOLE = "_";
    public static final String REGISTER_NAME_LAST      = "@";

    Register getRegister(String name);
    Register getDefaultRegister();
    Register getActiveRegister();
    Register getLastEditRegister();
    void setLastNamedRegister(Register register);
    void setActiveRegister(String name);
    void setActiveRegister(Register register);
    void activateDefaultRegister();
    void activateLastEditRegister();
    Command getLastEdit();
    void setLastEdit(Command edit);
    void setLastInsertion(Command command);
    Command getLastInsertion();
    void setLastSubstitution(TextOperation operation);
    TextOperation getLastSubstitution();
    void setLastYank(RegisterContent register);
    void setLastDelete(RegisterContent register);
    void setLastFindMotion(FindMotion motion);
    FindMotion getLastFindMotion();
    Search getSearch();
    void setSearch(Search search);
    boolean isDefaultRegisterActive();
	void setLastActiveSelection(PositionlessSelection instance);
	PositionlessSelection getLastActiveSelection();
    public abstract void setDefaultRegister(Register register);
    public void setCurrentWorkingDirectory(String cwd);
    public String getCurrentWorkingDirectory();
}
