function saveBug() {
    function success(response) {
        console.log(response);
        return response.json();
    }
    function errorHandler(error) {
        console.log(error);
    }
    const createBug = document.getElementById('createBug');

    if (!createBug.checkValidity()) {
        alert('form is invalid');
        return;
    }
    const promise = fetch('/bug', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            title: document.getElementById('title').value,
            description: document.getElementById('description').value,
            status: document.getElementById('status').value,
            priority: document.getElementById('priority').value,
            type: document.getElementById('type').value,
            submitOnDate: document.getElementById('submitOnDate').value,
            buildVersion: document.getElementById('buildVersion').value,
            projectId: document.getElementById('projectId').value,
            module: document.getElementById('module').value,
            product: document.getElementById('product').value,
        })
    });
    promise.then(success);
    promise.then(function (data) {
        console.log(data);
    })
    promise.catch(errorHandler);
}