package differ;

import differ.diff_match_patch.Diff;

// Store location of a diff in a file
public class diffObjectResult
{
	public int start = -1;
	public int end = -1;
	public Diff diffObject;
};
