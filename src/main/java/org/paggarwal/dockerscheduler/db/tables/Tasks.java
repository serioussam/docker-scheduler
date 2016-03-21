/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.paggarwal.dockerscheduler.db.Dockerscheduler;
import org.paggarwal.dockerscheduler.db.Keys;
import org.paggarwal.dockerscheduler.db.tables.records.TasksRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.2"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tasks extends TableImpl<TasksRecord> {

	private static final long serialVersionUID = 1135787491;

	/**
	 * The reference instance of <code>dockerscheduler.TASKS</code>
	 */
	public static final Tasks TASKS = new Tasks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TasksRecord> getRecordType() {
		return TasksRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.TASKS.id</code>.
	 */
	public final TableField<TasksRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.name</code>.
	 */
	public final TableField<TasksRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.created_on</code>.
	 */
	public final TableField<TasksRecord, Timestamp> CREATED_ON = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.image</code>.
	 */
	public final TableField<TasksRecord, String> IMAGE = createField("image", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.command</code>.
	 */
	public final TableField<TasksRecord, String> COMMAND = createField("command", org.jooq.impl.SQLDataType.VARCHAR.length(1024).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.type</code>.
	 */
	public final TableField<TasksRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.success</code>.
	 */
	public final TableField<TasksRecord, Integer> SUCCESS = createField("success", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.failed</code>.
	 */
	public final TableField<TasksRecord, Integer> FAILED = createField("failed", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>dockerscheduler.TASKS.cron</code>.
	 */
	public final TableField<TasksRecord, String> CRON = createField("cron", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * Create a <code>dockerscheduler.TASKS</code> table reference
	 */
	public Tasks() {
		this("TASKS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.TASKS</code> table reference
	 */
	public Tasks(String alias) {
		this(alias, TASKS);
	}

	private Tasks(String alias, Table<TasksRecord> aliased) {
		this(alias, aliased, null);
	}

	private Tasks(String alias, Table<TasksRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TasksRecord, Integer> getIdentity() {
		return Keys.IDENTITY_TASKS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TasksRecord> getPrimaryKey() {
		return Keys.KEY_TASKS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TasksRecord>> getKeys() {
		return Arrays.<UniqueKey<TasksRecord>>asList(Keys.KEY_TASKS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Tasks as(String alias) {
		return new Tasks(alias, this);
	}

	/**
	 * Rename this table
	 */
	public Tasks rename(String name) {
		return new Tasks(name, null);
	}
}
