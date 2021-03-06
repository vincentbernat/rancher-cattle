/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "process_execution", schema = "cattle")
public interface ProcessExecution extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.process_execution.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.process_execution.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.process_execution.process_instance_id</code>.
	 */
	public void setProcessInstanceId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.process_execution.process_instance_id</code>.
	 */
	@javax.persistence.Column(name = "process_instance_id", nullable = false, precision = 19)
	public java.lang.Long getProcessInstanceId();

	/**
	 * Setter for <code>cattle.process_execution.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.process_execution.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.process_execution.log</code>.
	 */
	public void setLog(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.process_execution.log</code>.
	 */
	@javax.persistence.Column(name = "log", length = 16777215)
	public java.util.Map<String,Object> getLog();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface ProcessExecution
	 */
	public void from(io.cattle.platform.core.model.ProcessExecution from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface ProcessExecution
	 */
	public <E extends io.cattle.platform.core.model.ProcessExecution> E into(E into);
}
