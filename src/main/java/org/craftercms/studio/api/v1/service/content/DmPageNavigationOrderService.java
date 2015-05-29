/*
 * Crafter Studio Web-content authoring solution
 * Copyright (C) 2007-2014 Crafter Software Corporation.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.studio.api.v1.service.content;


import org.dom4j.Document;

/**
 *
 * Order Service for Navigation Pages
 *
 * @author shankark
 * @author Dejan Brkic
 *
 */
public interface DmPageNavigationOrderService {

    /**
     * Return new navigation order
     */
    float getNewNavOrder(String site, String path);


    /**
     * Always adds/overwrites the Document element with new unique nav order
     *
     * @param doc
     * @return
     */
    boolean addNavOrder(String site, String path, Document doc);

    /**
     * Updates the Document element with new unique nav order if one does not exist
     *
     * @param document
     * @return
     */
    boolean updateNavOrder(String site, String path, Document document);

    void deleteSequencesForSite(String site);
}
