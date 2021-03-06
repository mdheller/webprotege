package edu.stanford.bmir.protege.web.shared.hierarchy;

import com.google.web.bindery.event.shared.Event;
import edu.stanford.bmir.protege.web.shared.project.ProjectId;
import org.semanticweb.owlapi.model.OWLObjectProperty;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 25/03/2013
 */
public class ObjectPropertyHierarchyParentRemovedEvent extends HierarchyChangedEvent<OWLObjectProperty, ObjectPropertyHierarchyParentRemovedHandler> {

    public transient static final Event.Type<ObjectPropertyHierarchyParentRemovedHandler> TYPE = new Event.Type<ObjectPropertyHierarchyParentRemovedHandler>();

    public ObjectPropertyHierarchyParentRemovedEvent(ProjectId source, OWLObjectProperty child, OWLObjectProperty parent, HierarchyId hierarchyId) {
        super(source, child, parent, hierarchyId);
    }

    private ObjectPropertyHierarchyParentRemovedEvent() {
    }

    @Override
    public Event.Type<ObjectPropertyHierarchyParentRemovedHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(ObjectPropertyHierarchyParentRemovedHandler handler) {
        handler.handleObjectPropertyHierarchyParentRemoved(this);
    }
}
