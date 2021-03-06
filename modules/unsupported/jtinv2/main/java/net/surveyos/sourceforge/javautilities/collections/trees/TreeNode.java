/*
 *    GeoTools - The Open Source Java GIS Toolkit
 *    http://geotools.org
 *
 *    (C) 2011, Open Source Geospatial Foundation (OSGeo)
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License as published by the Free Software Foundation;
 *    version 2.1 of the License.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 */

package net.surveyos.sourceforge.javautilities.collections.trees;

import java.util.List;

/**
 * A node in a tree.
 */
public interface TreeNode<E>
{
	/**
	 * Get the int that uniquely identifies this node in the tree.
	 */
	public abstract int getIdentifier();
	
	/**
	 * Returns the level of the node in the tree. The root node is at level 1. The
	 * levels increase by 1 from that level.
	 */
	public abstract int getLevel();
	
	/**
	 * Returns the node that is the parent of this node.
	 */
	public abstract TreeNode<E> getParent();

	/**
	 * Returns a list of the TreeNode objects that are children of this node.
	 */
	public abstract List<TreeNode<E>> getChildren();
	
	/**
	 * Returns the object that is the value of this node.
	 */
	public abstract E getValue();
	
	public abstract boolean isLeafNode();
	
	public abstract boolean isRootNode();
	
	public abstract void addChildNode(TreeNode<E> argChildNode);
}
