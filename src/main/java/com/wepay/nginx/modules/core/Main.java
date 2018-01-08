package com.wepay.nginx.modules.core;

import com.wepay.nginx.Context;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import com.wepay.nginx.modules.google.perftools.*;
import com.wepay.nginx.modules.http.core.*;
import com.wepay.nginx.modules.mail.core.*;
import com.wepay.nginx.modules.stream.core.*;
import com.wepay.nginx.Dumps;
import com.wepay.nginx.exceptions.InvalidConditionDirectiveException;

import static com.wepay.nginx.Constants.*;

public class Main extends Context {

	@JsonProperty("daemon")
	private Daemon daemon;

	@JsonProperty("debug_points")
	private DebugPoints debugPoints;

	@JsonProperty("env")
	private Env env;

	@JsonProperty("error_log")
	private ErrorLog errorLog;

	@JsonProperty("events")
	private Events events;

	@JsonProperty("google_perftools_profiles")
	private GooglePerftoolsProfiles googlePerftoolsProfiles;

	@JsonProperty("http")
	private Http http;

	@JsonProperty("load_module")
	private LoadModule loadModule;

	@JsonProperty("lock_file")
	private LockFile lockFile;

	@JsonProperty("mail")
	private Mail mail;

	@JsonProperty("master_process")
	private MasterProcess masterProcess;

	@JsonProperty("pcre_jit")
	private PcreJit pcreJit;

	@JsonProperty("pid")
	private Pid pid;

	@JsonProperty("ssl_engine")
	private SslEngine sslEngine;

	@JsonProperty("stream")
	private Stream stream;

	@JsonProperty("thread_pool")
	private ThreadPool threadPool;

	@JsonProperty("timer_resolution")
	private TimerResolution timerResolution;

	@JsonProperty("user")
	private User user;

	@JsonProperty("worker_cpu_affinity")
	private WorkerCpuAffinity workerCpuAffinity;

	@JsonProperty("worker_priority")
	private WorkerPriority workerPriority;

	@JsonProperty("worker_processes")
	private WorkerProcesses workerProcesses;

	@JsonProperty("worker_rlimit_core")
	private WorkerRlimitCore workerRlimitCore;

	@JsonProperty("worker_rlimit_nofile")
	private WorkerRlimitNofile workerRlimitNofile;

	@JsonProperty("worker_shutdown_timeout")
	private WorkerShutdownTimeout workerShutdownTimeout;

	@JsonProperty("working_directory")
	private WorkingDirectory workingDirectory;

	public Main() {
		super(null, null, "main");
	}

	public Daemon getDaemon() {
		return daemon;
	}

	public void setDaemon(Daemon daemon) {
		this.daemon = daemon;
	}

	public DebugPoints getDebugPoints() {
		return debugPoints;
	}

	public void setDebugPoints(DebugPoints debugPoints) {
		this.debugPoints = debugPoints;
	}

	public Env getEnv() {
		return env;
	}

	public void setEnv(Env env) {
		this.env = env;
	}

	public ErrorLog getErrorLog() {
		return errorLog;
	}

	public void setErrorLog(ErrorLog errorLog) {
		this.errorLog = errorLog;
	}

	public Events getEvents() {
		return events;
	}

	public void setEvents(Events events) {
		this.events = events;
	}

	public GooglePerftoolsProfiles getGooglePerftoolsProfiles() {
		return googlePerftoolsProfiles;
	}

	public void setGooglePerftoolsProfiles(GooglePerftoolsProfiles googlePerftoolsProfiles) {
		this.googlePerftoolsProfiles = googlePerftoolsProfiles;
	}

	public Http getHttp() {
		return http;
	}

	public void setHttp(Http http) {
		this.http = http;
	}

	public LoadModule getLoadModule() {
		return loadModule;
	}

	public void setLoadModule(LoadModule loadModule) {
		this.loadModule = loadModule;
	}

	public LockFile getLockFile() {
		return lockFile;
	}

	public void setLockFile(LockFile lockFile) {
		this.lockFile = lockFile;
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

	public MasterProcess getMasterProcess() {
		return masterProcess;
	}

	public void setMasterProcess(MasterProcess masterProcess) {
		this.masterProcess = masterProcess;
	}

	public PcreJit getPcreJit() {
		return pcreJit;
	}

	public void setPcreJit(PcreJit pcreJit) {
		this.pcreJit = pcreJit;
	}

	public Pid getPid() {
		return pid;
	}

	public void setPid(Pid pid) {
		this.pid = pid;
	}

	public SslEngine getSslEngine() {
		return sslEngine;
	}

	public void setSslEngine(SslEngine sslEngine) {
		this.sslEngine = sslEngine;
	}

	public Stream getStream() {
		return stream;
	}

	public void setStream(Stream stream) {
		this.stream = stream;
	}

	public ThreadPool getThreadPool() {
		return threadPool;
	}

	public void setThreadPool(ThreadPool threadPool) {
		this.threadPool = threadPool;
	}

	public TimerResolution getTimerResolution() {
		return timerResolution;
	}

	public void setTimerResolution(TimerResolution timerResolution) {
		this.timerResolution = timerResolution;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public WorkerCpuAffinity getWorkerCpuAffinity() {
		return workerCpuAffinity;
	}

	public void setWorkerCpuAffinity(WorkerCpuAffinity workerCpuAffinity) {
		this.workerCpuAffinity = workerCpuAffinity;
	}

	public WorkerPriority getWorkerPriority() {
		return workerPriority;
	}

	public void setWorkerPriority(WorkerPriority workerPriority) {
		this.workerPriority = workerPriority;
	}

	public WorkerProcesses getWorkerProcesses() {
		return workerProcesses;
	}

	public void setWorkerProcesses(WorkerProcesses workerProcesses) {
		this.workerProcesses = workerProcesses;
	}

	public WorkerRlimitCore getWorkerRlimitCore() {
		return workerRlimitCore;
	}

	public void setWorkerRlimitCore(WorkerRlimitCore workerRlimitCore) {
		this.workerRlimitCore = workerRlimitCore;
	}

	public WorkerRlimitNofile getWorkerRlimitNofile() {
		return workerRlimitNofile;
	}

	public void setWorkerRlimitNofile(WorkerRlimitNofile workerRlimitNofile) {
		this.workerRlimitNofile = workerRlimitNofile;
	}

	public WorkerShutdownTimeout getWorkerShutdownTimeout() {
		return workerShutdownTimeout;
	}

	public void setWorkerShutdownTimeout(WorkerShutdownTimeout workerShutdownTimeout) {
		this.workerShutdownTimeout = workerShutdownTimeout;
	}

	public WorkingDirectory getWorkingDirectory() {
		return workingDirectory;
	}

	public void setWorkingDirectory(WorkingDirectory workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	@Override
	public String dump(int level, String ctx) throws InvalidConditionDirectiveException {
		if (getComment() != null && !getComment().trim().isEmpty()) {
			return "#" + getComment() + NEWLINE + super.dump(level, ctx);
		}
		return super.dump(level, ctx);
	}

	@Override
	public void populateMap() {

		Map<String, Dumps> map = getMap();
		map.put("daemon", daemon);
		map.put("debug_points", debugPoints);
		map.put("env", env);
		map.put("error_log", errorLog);
		map.put("events", events);
		map.put("google_perftools_profiles", googlePerftoolsProfiles);
		map.put("http", http);
		map.put("load_module", loadModule);
		map.put("lock_file", lockFile);
		map.put("mail", mail);
		map.put("master_process", masterProcess);
		map.put("pcre_jit", pcreJit);
		map.put("pid", pid);
		map.put("ssl_engine", sslEngine);
		map.put("stream", stream);
		map.put("thread_pool", threadPool);
		map.put("timer_resolution", timerResolution);
		map.put("user", user);
		map.put("worker_cpu_affinity", workerCpuAffinity);
		map.put("worker_priority", workerPriority);
		map.put("worker_processes", workerProcesses);
		map.put("worker_rlimit_core", workerRlimitCore);
		map.put("worker_rlimit_nofile", workerRlimitNofile);
		map.put("worker_shutdown_timeout", workerShutdownTimeout);
		map.put("working_directory", workingDirectory);

	}
}
