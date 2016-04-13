/**
 * This class is generated by jOOQ
 */
package org.paggarwal.dockerscheduler.db.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.paggarwal.dockerscheduler.db.Dockerscheduler;
import org.paggarwal.dockerscheduler.db.Keys;
import org.paggarwal.dockerscheduler.db.tables.records.QrtzCalendarsRecord;


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
public class QrtzCalendars extends TableImpl<QrtzCalendarsRecord> {

	private static final long serialVersionUID = -100399653;

	/**
	 * The reference instance of <code>dockerscheduler.QRTZ_CALENDARS</code>
	 */
	public static final QrtzCalendars QRTZ_CALENDARS = new QrtzCalendars();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<QrtzCalendarsRecord> getRecordType() {
		return QrtzCalendarsRecord.class;
	}

	/**
	 * The column <code>dockerscheduler.QRTZ_CALENDARS.SCHED_NAME</code>.
	 */
	public final TableField<QrtzCalendarsRecord, String> SCHED_NAME = createField("SCHED_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_CALENDARS.CALENDAR_NAME</code>.
	 */
	public final TableField<QrtzCalendarsRecord, String> CALENDAR_NAME = createField("CALENDAR_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(200).nullable(false), this, "");

	/**
	 * The column <code>dockerscheduler.QRTZ_CALENDARS.CALENDAR</code>.
	 */
	public final TableField<QrtzCalendarsRecord, byte[]> CALENDAR = createField("CALENDAR", org.jooq.impl.SQLDataType.BLOB.nullable(false), this, "");

	/**
	 * Create a <code>dockerscheduler.QRTZ_CALENDARS</code> table reference
	 */
	public QrtzCalendars() {
		this("QRTZ_CALENDARS", null);
	}

	/**
	 * Create an aliased <code>dockerscheduler.QRTZ_CALENDARS</code> table reference
	 */
	public QrtzCalendars(String alias) {
		this(alias, QRTZ_CALENDARS);
	}

	private QrtzCalendars(String alias, Table<QrtzCalendarsRecord> aliased) {
		this(alias, aliased, null);
	}

	private QrtzCalendars(String alias, Table<QrtzCalendarsRecord> aliased, Field<?>[] parameters) {
		super(alias, Dockerscheduler.DOCKERSCHEDULER, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<QrtzCalendarsRecord> getPrimaryKey() {
		return Keys.KEY_QRTZ_CALENDARS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<QrtzCalendarsRecord>> getKeys() {
		return Arrays.<UniqueKey<QrtzCalendarsRecord>>asList(Keys.KEY_QRTZ_CALENDARS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public QrtzCalendars as(String alias) {
		return new QrtzCalendars(alias, this);
	}

	/**
	 * Rename this table
	 */
	public QrtzCalendars rename(String name) {
		return new QrtzCalendars(name, null);
	}
}