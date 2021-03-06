package main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import math.geom2d.Point2D;
import math.geom3d.Point3D;
import math.geom3d.Vector3D;

public class Constants {
	static public final Point3D farPoint = new Point3D(0,0,1e9);
	static public final Point2D far2D = new Point2D(0,1e9);
	static public final Point3D origin = new Point3D(0,0,0);
	static public final Vector3D xplus = new Vector3D(1,0,0);
	static public final Vector3D xminus = new Vector3D(-1,0,0);
	static public final Vector3D yplus = new Vector3D(0,1,0);
	static public final Vector3D yminus = new Vector3D(0,-1,0);
	static public final Vector3D zplus = new Vector3D(0,0,1);
	static public final Vector3D zminus = new Vector3D(0,0,-1);
	static public final double tol = 1e-4;
	static public final double solidSpacing = 1.09;
	static private java.text.DecimalFormatSymbols enus = new DecimalFormatSymbols(Locale.ENGLISH);
	static public DecimalFormat ext = new DecimalFormat("#.#####", enus);	//Extrusion
	static public DecimalFormat xyz = new DecimalFormat("#.###", enus);		//Position
	static public Vector3D zero =  new Vector3D(0,0,0);
}
